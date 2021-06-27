<template>
  <div>
    <div style="width: 100%; margin: 0 auto">
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
        >&nbsp;一流学科
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
  </div>
</template>
<script>
import axios from 'axios'
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
        Datatitle: [
            {
            lineid: "1",
            },
        ],
        };
    },
    methods: {
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
            url:"/findAllByType",
            method: 'post',
            params: {start:1,type:'一流学科'}
          })
            .then(response=>(
            this.tableData = response.data.records,
              this.totalPage= response.data.pages
          )).catch(error=>{
              console.log(error)
          })
    },
    };
</script>
<style>
</style>