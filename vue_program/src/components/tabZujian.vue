<template>
    <div class="tabZujian" style="width:78%;margin:auto;">       
        <div style="background-color:#F2F8FE;height:38px;margin:auto;">
            <p style="display:block;float:left;width:81%;text-align:left;margin-top:9px"><i class="el-icon-office-building"  style="color:blue;font-size:20px;margin-top:1px;display:block;float:left;margin-left:8px"></i>&nbsp;教育部全国高校名单（截止2020-06-30）</p>       
            <el-tabs v-model="activeName" @tab-click="goTo1('/tabZujianChild1')" style="float:left">

                <el-tab-pane label="按高校查询" index="/tabZujianChild1" name="first" :key="'first'">
                     
                </el-tab-pane>
               
                </el-tabs>
            <el-tabs v-model="activeName" @tab-click="goTo1('/tabZujianChild2')" style="float:left;margin-left:20px">
                <el-tab-pane  label="按地区查询"  index="/tabZujianChild2" name="second" :key="'second'">
                    <!-- <child2 v-if="isChildUpdate2"></child2>     -->
                </el-tab-pane>
            </el-tabs>
        </div>
        <div style="float:left;display:block;margin:auto;width:100%;">
            <router-view></router-view>
        </div>
        <!-- <router-view
      style="
        width: 80%;
        margin-left: 19%;
        margin-top: 6px;
        box-shadow: 2px 4px 6px #EAEAEA, 2px 2px 3px #EAEAEA, 2px 2px 3px #EAEAEA;
        border-radius: 4px;
        border: solid 1px white;
        background-color:red;border:solid 1px red;height:200px;
      "
    ></router-view> -->
    </div>
</template>

<script>
import tabZujianChild1 from './tabComponents/tabZujianChild1'
import tabZujianChild2 from './tabComponents/tabZujianChild2'
export default {
    name: 'tabZujian',
    components:{
        tabZujianChild1:tabZujianChild1,
        tabZujianChild1:tabZujianChild2
    },
    data() {
        return {
            //默认第一个选项卡
            activeName: "first",
            isChildUpdate1:true,
            isChildUpdate2:false,
            position:"right",
        }
    },
    mounted(){
        
    },
    methods:{
        handleClick(tab) {
            if(tab.name == "first") {
                this.isChildUpdate1 = true;
                this.isChildUpdate2 = false;
            } else if(tab.name == "second") {
                this.isChildUpdate1 = false;
                this.isChildUpdate2 = true;
            }
        },
        goTo1(path) {
            console.log('我执行啦')
            this.$router.replace(path);
        }
    }
}
</script>


