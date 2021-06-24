<template>
  <div style="">
    <el-table :data="tableData1" style="width: 100%;background-color:pink;margin-top:-100px" class="table1" border>
      <el-table-column
        v-for="(item,i) in tableCol"
        :key="i"
        :prop="item.prop"
        :label="item.label"
        :width="item.width"
      ></el-table-column>

    </el-table>
  </div>
</template>
<script>
export default {
  name: "first_class",
  data() {
    return {
      showOper:true,
      tableData1: [
        { lineid: "1", code: "嘻嘻", schoolname: "广州天河东圃", province:"",city:'',department:'',level:'',type:''},

      ],
      tableCol: [
        { prop: "lineid", label: "序号", width:50},
        { prop: "code", label: "学校标识码", width: 150 },
        { prop: "schoolname", label: "学校名称", width: 150 },
        { prop: "province", label: "所在地区", width: 120 },
        { prop: "city", label: "所在城市", width: 120 },
        { prop: "department", label: "主管部门", width: 120 },
        { prop: "level", label: "办学层次", width: 120 },
        { prop: "type", label: "高校类型" },

      ]
    };
  },
  methods: {

  },
};
</script>
