<template>
  <el-row class="rac">
    <el-col style="width:18%;">
      <el-menu style="border:solid 1px white;box-shadow: 0 4px 8px #EAEAEA, 0 0 2px #EAEAEA, 0 0 2px #EAEAEA;margin:6px;border-radius:4px; "
        default-active="2"
        class="el-menu-vertical-demo"
        @open="handleOpen"
        @close="handleClose"
      >

        <el-submenu index="1" unique-opened="true">
          <template slot="title">
            <div style="margin-left:-50px">
                <i class="el-icon-plus"></i>
                <span>高校类型</span>
            </div>
            
            
          </template>
          <el-menu-item-group style="background-color:#F8F8F8;">
           
            <el-menu-item index="1-1" style="margin-top:-14px"  @click="goTo('/First_class')">一流大学</el-menu-item>
            <el-menu-item index="1-2"  @click="goTo('/Subject')">一流学科</el-menu-item>
            <el-menu-item index="1-3">985高校</el-menu-item>
            <el-menu-item index="1-4" style="margin-buttom:0px">211高校</el-menu-item>

          </el-menu-item-group>

        </el-submenu>
        <el-submenu index="2">
          <template slot="title">
                <div style="margin-left:-50px">
                    <i class="el-icon-plus"></i>
                    <span>所在地区</span>
                </div>         
          </template>
          <el-menu-item-group :span="2" style="background-color:#F8F8F8;">
           
            <el-menu-item index="2-1" style="margin-top:-14px">北京市</el-menu-item>
            <el-menu-item index="2-2">四川省</el-menu-item>
            <el-menu-item index="2-3">天津市</el-menu-item>
            <el-menu-item index="2-4">河北省</el-menu-item>
            <el-menu-item index="2-5">山西省</el-menu-item>
            <el-menu-item index="2-6">内蒙古自治区</el-menu-item>
            <el-menu-item index="2-7">辽宁省</el-menu-item>
            <el-menu-item index="2-8">吉林省</el-menu-item>
            <el-menu-item index="2-9">黑龙江省</el-menu-item>
            <el-menu-item index="2-10">上海市</el-menu-item>
            <el-menu-item index="2-11">江苏省</el-menu-item>
            <el-menu-item index="2-12">浙江省</el-menu-item>
            <el-menu-item index="2-13">安徽省</el-menu-item>
            <el-menu-item index="2-14">福建省</el-menu-item>
            <el-menu-item index="2-15">江西省</el-menu-item>
            <el-menu-item index="2-16">山东省</el-menu-item>
            <el-menu-item index="2-17">河南省</el-menu-item>
            <el-menu-item index="2-18">湖北省</el-menu-item>
            <el-menu-item index="2-19">湖南省</el-menu-item>
            <el-menu-item index="2-20">广东省</el-menu-item>
            <el-menu-item index="2-21">广西壮族自治区</el-menu-item>
            <el-menu-item index="2-22">海南省</el-menu-item>
            <el-menu-item index="2-23">重庆市</el-menu-item>
            <el-menu-item index="2-24">贵州省</el-menu-item>
            <el-menu-item index="2-25">云南省</el-menu-item>
            <el-menu-item index="2-26">西藏自治区</el-menu-item>
            <el-menu-item index="2-27">陕西省</el-menu-item>
            <el-menu-item index="2-28">甘肃省</el-menu-item>
            <el-menu-item index="2-29">青海省</el-menu-item>
            <el-menu-item index="2-30">宁夏回族自治区</el-menu-item>
            <el-menu-item index="2-31" style="margin-buttom:0px">新疆维吾尔自治区</el-menu-item>
          </el-menu-item-group>

        </el-submenu>
        
      </el-menu>
      

    </el-col>
        <div style="width: 81%; margin-top:8px; margin-left:19%;box-shadow: 0 4px 8px #EAEAEA, 0 0 2px #EAEAEA, 0 0 2px #EAEAEA;border-radius:4px;border:solid 1px white;">
            <router-view></router-view>
        </div> 
  </el-row>
</template>

<script>
export default {
  data() {
    return {};
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
    }
  }
};
</script>

<style>


.el-menu-item.is-active {
      background-color: #3370ff !important;
      color: white !important;

}
.list1 :hover{
background-color: #3370ff;
}
</style>

