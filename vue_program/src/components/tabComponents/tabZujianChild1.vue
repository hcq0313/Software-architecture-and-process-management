<template>
  <el-row class="tac">
    <el-col style="width: 18%">
      <el-menu
        style="
          border: solid 1px white;
          box-shadow: 0 4px 8px #eaeaea, 0 0 2px #eaeaea, 0 0 2px #eaeaea;

          margin: 6px;
          border-radius: 4px;
        "
        default-active="2"
        class="el-menu-vertical-demo"
        @open="handleOpen"
        @close="handleClose"
      >
        <div class="box1" style="width=100px;height:160px">
          <el-input
            style="width: 86%; margin-top: 18px"
            placeholder="请输入关键词"
            v-model="search_school"
          >
            <i
              slot="suffix"
              class="el-icon-s-promotion"
              style="font-size: 23px; margin-top: 9px"
            ></i>
          </el-input>
          <el-button
            type="primary"
            style="width: 86%; margin-top: 15px"
            @click="search_sc()"
            >查询</el-button
          >

          <p style="font-size: 12px; margin: auto; margin-top: 12px">
            <span style="color: red">*</span>&nbsp;&nbsp;请输入关键词并点击查询
          </p>
        </div>
      </el-menu>
    </el-col>
    <div
      style="
        width: 81%;
        margin-top: 8px;
        margin-left: 19%;
        box-shadow: 0 4px 8px #eaeaea, 0 0 2px #eaeaea, 0 0 2px #eaeaea;
        border-radius: 4px;
        border: solid 1px white;
      "
    >
      <!-- <p align="left">自定义表头样式</p> -->
      <p
        style="
          display: block;
          float: left;
          width: 81%;
          text-align: left;
          margin-top: 9px;
        "
      >
        <i
          class="el-icon-data-line"
          style="
            color: blue;
            font-size: 20px;
            margin-top: 1px;
            display: block;
            float: left;
            margin-left: 8px;
          "
        ></i
        >&nbsp;全国普通高等学校名单
      </p>
      <el-table
        :data="tableData"
        border
        :stripe="true"
        :row-style="tableRowStyle"
        :header-cell-style="tableHeaderColor"
        style="width: 100%"
      >
        <el-table-column prop="lineid" label="序号" width="60" align="center">
        </el-table-column>
        <el-table-column prop="code" label="学校标识码" width="130" align="center">
        </el-table-column>
        <el-table-column prop="schoolname" label="学校名称" width="150" align="center">
        </el-table-column>
        <el-table-column prop="province" label="所在地区" width="90" align="center">
        </el-table-column>
        <el-table-column prop="city" label="所在城市" width="90" align="center">
        </el-table-column>
        <el-table-column prop="department" label="主管部门" width="150" align="center">
        </el-table-column>
        <el-table-column prop="level" label="办学层次" width="90" align="center">
        </el-table-column>
        <el-table-column prop="type" label="高校类型" align="center"> </el-table-column>
      </el-table>
    </div>
  </el-row>
</template>

<script>
export default {
  data() {
    return {
      tableData: [
        {
          lineid: "1",
          code: "4111010001",
          schoolname: "北京大学",
          province: "北京市",
          city: "北京市",
          department: "教育部",
          level: "本科",
          type: "一流大学A类,985,211",
        },
      ],
      search_school: "",
    };
  },

  methods: {
    handleOpen(key, keyPath) {
      console.log(key, keyPath);
    },
    handleClose(key, keyPath) {
      console.log(key, keyPath);
    },
    goTo(path) {
      this.$router.replace(path);
    },
    search_sc() {
      console.log("search_school:", this.search_school);
      // console.log('我执行啦')
      this.$axios({
        url: "/findNameUnversity",
        method: "post",
        params: { start: 1,searcherName: this.search_school},
      })
        .then(
          (response) => (
            (this.tableData = response.data.records),
            (this.totalPage = response.data.pages)
          )
        )
        .catch((error) => {
          console.log(error);
        });
    },
    //设置表格行的样式
    tableRowStyle({ row, rowIndex }) {
      return "background-color:pink;font-size:15px;";
    },
    //设置表头行的样式
    tableHeaderColor({ row, column, rowIndex, columnIndex }) {
      return "background-color:lightblue;color:#fff;font-size:16px;text-align:center";
    },
  },
  mounted() {
    this.$axios({
      url: "/unversity",
      method: "post",
      params: { start: 1 },
    })
      .then(
        (response) => (
          (this.tableData = response.data.records),
          (this.totalPage = response.data.pages)
        )
      )
      .catch((error) => {
        console.log(error);
      });
  },
};
</script>


