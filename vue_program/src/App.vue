<template>
  <div id="app">
    <!-- <Test></Test> -->
    <tabZujian></tabZujian>

    <!-- <router-view/> -->
  </div>
</template>

<script>
import Test from './components/test.vue'
import tabZujian from './components/tabZujian.vue'
// import './assets/icons/iconfont'
export default {
  components:{
    // Test,
    tabZujian,


  },
  name: 'App'
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
