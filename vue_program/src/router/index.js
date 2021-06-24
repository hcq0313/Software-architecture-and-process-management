import Vue from 'vue'
import Router from 'vue-router'
// import HelloWorld from '@/components/HelloWorld'
import First_class from '../components/tabComponents/first_class';
import Subject from '../components/types/Subject.vue';
import SchoolList from '../components/types/school_list';
import tabZujianChild1 from '../components/tabComponents/tabZujianChild1.vue'
import tabZujianChild2 from '../components/tabComponents/tabZujianChild2.vue'
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
            ]
        },

    ]
})