import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '@/components/HelloWorld'
import First_class from '../components/types/first_class.vue';
import Subject from '../components/types/Subject.vue';
Vue.use(Router)

export default new Router({
    routes: [{
        path: '/',
        name: 'HelloWorld',
        component: HelloWorld
    }, {
        path: '/First_class',
        name: 'First_class',
        component: First_class
    }, {
        path: '/Subject',
        name: 'Subject',
        component: Subject
    }]
})