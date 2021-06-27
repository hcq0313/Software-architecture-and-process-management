import Vue from 'vue'
import Router from 'vue-router'
// import HelloWorld from '@/components/HelloWorld'
import First_class from '../components/tabComponents/first_class';
import Subject from '../components/types/Subject.vue';
import SchoolList from '../components/types/school_list';
import tabZujianChild1 from '../components/tabComponents/tabZujianChild1.vue'
import tabZujianChild2 from '../components/tabComponents/tabZujianChild2.vue'
import school985 from '../components/types/school985.vue'
import school211 from '../components/types/school211.vue'

//省份
import beijing from '../components/diqu/beijing.vue'
import sichuan from '../components/diqu/sichuan.vue'
import tianjin from '../components/diqu/tianjin.vue'
import hebei from '../components/diqu/hebei.vue'
import shanxi from '../components/diqu/shanxi.vue'
import neimeng from '../components/diqu/neimeng.vue'
import jilin from '../components/diqu/jilin.vue'
import liaoning from '../components/diqu/liaoning.vue'
import heilongjiang from '../components/diqu/heilongjiang.vue'
Vue.use(Router)

export default new Router({
    routes: [{
            path: '/',
            name: 'tabZujianChild1',
            component: tabZujianChild1,
        },
        {
            path: '/tabZujianChild1',
            name: 'tabZujianChild1',
            component: tabZujianChild1,
        },
        {
            path: '/tabZujianChild2',
            name: 'tabZujianChild2',
            component: tabZujianChild2,
            children: [{
                    path: '/',
                    name: 'First_class',
                    component: First_class,
                },
                {
                    path: '/First_class',
                    name: 'First_class',
                    component: First_class,
                },
                {
                    path: '/Subject',
                    name: 'Subject',
                    component: Subject
                },
                {
                    path: '/beijing',
                    name: 'beijing',
                    component: beijing
                },
                {
                    path: '/school985',
                    name: 'school985',
                    component: school985
                }, {
                    path: '/school211',
                    name: 'school211',
                    component: school211
                },
                {
                    path: '/sichuan',
                    name: 'sichuan',
                    component: sichuan
                },
                {
                    path: '/tianjin',
                    name: 'tianjin',
                    component: tianjin
                },
                {
                    path: '/hebei',
                    name: 'hebei',
                    component: hebei
                },
                {
                    path: '/shanxi',
                    name: 'shanxi',
                    component: shanxi
                },
                {
                    path: '/neimeng',
                    name: 'neimeng',
                    component: neimeng
                },
                {
                    path: '/jilin',
                    name: 'jilin',
                    component: jilin
                },
                {
                    path: '/liaoning',
                    name: 'liaoning',
                    component: liaoning
                },
                {
                    path: '/heilongjiang',
                    name: 'heilongjiang',
                    component: heilongjiang
                },
            ]
        },

    ]
})