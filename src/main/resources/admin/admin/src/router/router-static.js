import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import caipuxinxi from '@/views/modules/caipuxinxi/list'
    import shicaifenlei from '@/views/modules/shicaifenlei/list'
    import shangpinxinxi from '@/views/modules/shangpinxinxi/list'
    import discussshicaixinxi from '@/views/modules/discussshicaixinxi/list'
    import storeup from '@/views/modules/storeup/list'
    import discussmeishirizhi from '@/views/modules/discussmeishirizhi/list'
    import discusscaipuxinxi from '@/views/modules/discusscaipuxinxi/list'
    import discussjiankangwenzhang from '@/views/modules/discussjiankangwenzhang/list'
    import caipufenlei from '@/views/modules/caipufenlei/list'
    import yonghu from '@/views/modules/yonghu/list'
    import shangpinfenlei from '@/views/modules/shangpinfenlei/list'
    import discussshangpinxinxi from '@/views/modules/discussshangpinxinxi/list'
    import shicaixinxi from '@/views/modules/shicaixinxi/list'
    import orders from '@/views/modules/orders/list'
    import config from '@/views/modules/config/list'
    import meishirizhi from '@/views/modules/meishirizhi/list'
    import jiankangwenzhang from '@/views/modules/jiankangwenzhang/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/caipuxinxi',
        name: '菜谱信息',
        component: caipuxinxi
      }
      ,{
	path: '/shicaifenlei',
        name: '食材分类',
        component: shicaifenlei
      }
      ,{
	path: '/shangpinxinxi',
        name: '商品信息',
        component: shangpinxinxi
      }
      ,{
	path: '/discussshicaixinxi',
        name: '食材信息评论',
        component: discussshicaixinxi
      }
      ,{
	path: '/storeup',
        name: '我的收藏管理',
        component: storeup
      }
      ,{
	path: '/discussmeishirizhi',
        name: '美食日志评论',
        component: discussmeishirizhi
      }
      ,{
	path: '/discusscaipuxinxi',
        name: '菜谱信息评论',
        component: discusscaipuxinxi
      }
      ,{
	path: '/discussjiankangwenzhang',
        name: '健康文章评论',
        component: discussjiankangwenzhang
      }
      ,{
	path: '/caipufenlei',
        name: '菜谱分类',
        component: caipufenlei
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/shangpinfenlei',
        name: '商品分类',
        component: shangpinfenlei
      }
      ,{
	path: '/discussshangpinxinxi',
        name: '商品信息评论',
        component: discussshangpinxinxi
      }
      ,{
	path: '/shicaixinxi',
        name: '食材信息',
        component: shicaixinxi
      }
      ,{
        path: '/orders/:status',
        name: '订单管理',
        component: orders
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/meishirizhi',
        name: '美食日志',
        component: meishirizhi
      }
      ,{
	path: '/jiankangwenzhang',
        name: '健康文章',
        component: jiankangwenzhang
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
