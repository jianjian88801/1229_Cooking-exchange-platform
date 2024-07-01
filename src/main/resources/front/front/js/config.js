
var projectName = '厨艺交流平台';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
{
	name: '我的订单',
	url: '../shop-order/list.html'
},

{
	name: '我的地址',
	url: '../shop-address/list.html'
},

{
	name: '我的收藏',
	url: '../storeup/list.html'
}
]


var indexNav = [

{
	name: '菜谱信息',
	url: './pages/caipuxinxi/list.html'
}, 
{
	name: '食材信息',
	url: './pages/shicaixinxi/list.html'
}, 
{
	name: '商品信息',
	url: './pages/shangpinxinxi/list.html'
}, 
{
	name: '美食日志',
	url: './pages/meishirizhi/list.html'
}, 
{
	name: '健康文章',
	url: './pages/jiankangwenzhang/list.html'
}, 

]

var adminurl =  "http://localhost:8080/springbooted1p6/admin/dist/index.html";

var cartFlag = false

var chatFlag = false


cartFlag = true


var menu = [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"食材分类","menuJump":"列表","tableName":"shicaifenlei"}],"menu":"食材分类管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"菜谱分类","menuJump":"列表","tableName":"caipufenlei"}],"menu":"菜谱分类管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"菜谱信息","menuJump":"列表","tableName":"caipuxinxi"}],"menu":"菜谱信息管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"食材信息","menuJump":"列表","tableName":"shicaixinxi"}],"menu":"食材信息管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"商品分类","menuJump":"列表","tableName":"shangpinfenlei"}],"menu":"商品分类管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"商品信息","menuJump":"列表","tableName":"shangpinxinxi"}],"menu":"商品信息管理"},{"child":[{"buttons":["查看","修改","删除","查看评论"],"menu":"美食日志","menuJump":"列表","tableName":"meishirizhi"}],"menu":"美食日志管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"健康文章","menuJump":"列表","tableName":"jiankangwenzhang"}],"menu":"健康文章管理"},{"child":[{"buttons":["查看","修改"],"menu":"轮播图管理","tableName":"config"}],"menu":"系统管理"},{"child":[{"buttons":["查看","删除"],"menu":"已发货订单","tableName":"orders/已发货"},{"buttons":["查看","删除"],"menu":"未支付订单","tableName":"orders/未支付"},{"buttons":["查看","删除"],"menu":"已取消订单","tableName":"orders/已取消"},{"buttons":["查看","删除","发货"],"menu":"已支付订单","tableName":"orders/已支付"},{"buttons":["查看","删除"],"menu":"已退款订单","tableName":"orders/已退款"},{"buttons":["查看","删除"],"menu":"已完成订单","tableName":"orders/已完成"}],"menu":"订单管理"}],"frontMenu":[{"child":[{"buttons":["查看","查看评论"],"menu":"菜谱信息列表","menuJump":"列表","tableName":"caipuxinxi"}],"menu":"菜谱信息模块"},{"child":[{"buttons":["查看","查看评论"],"menu":"食材信息列表","menuJump":"列表","tableName":"shicaixinxi"}],"menu":"食材信息模块"},{"child":[{"buttons":["查看","查看评论"],"menu":"商品信息列表","menuJump":"列表","tableName":"shangpinxinxi"}],"menu":"商品信息模块"},{"child":[{"buttons":["查看","查看评论"],"menu":"美食日志列表","menuJump":"列表","tableName":"meishirizhi"}],"menu":"美食日志模块"},{"child":[{"buttons":["查看","查看评论"],"menu":"健康文章列表","menuJump":"列表","tableName":"jiankangwenzhang"}],"menu":"健康文章模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"美食日志","menuJump":"列表","tableName":"meishirizhi"}],"menu":"美食日志管理"},{"child":[{"buttons":["查看","修改"],"menu":"我的收藏管理","tableName":"storeup"}],"menu":"我的收藏管理"},{"child":[{"buttons":["删除","查看","确认收货"],"menu":"已发货订单","tableName":"orders/已发货"},{"buttons":["查看","删除"],"menu":"未支付订单","tableName":"orders/未支付"},{"buttons":["删除","查看"],"menu":"已取消订单","tableName":"orders/已取消"},{"buttons":["查看","删除"],"menu":"已支付订单","tableName":"orders/已支付"},{"buttons":["删除","查看"],"menu":"已退款订单","tableName":"orders/已退款"},{"buttons":["删除","查看"],"menu":"已完成订单","tableName":"orders/已完成"}],"menu":"订单管理"}],"frontMenu":[{"child":[{"buttons":["查看","查看评论"],"menu":"菜谱信息列表","menuJump":"列表","tableName":"caipuxinxi"}],"menu":"菜谱信息模块"},{"child":[{"buttons":["查看","查看评论"],"menu":"食材信息列表","menuJump":"列表","tableName":"shicaixinxi"}],"menu":"食材信息模块"},{"child":[{"buttons":["查看","查看评论"],"menu":"商品信息列表","menuJump":"列表","tableName":"shangpinxinxi"}],"menu":"商品信息模块"},{"child":[{"buttons":["查看","查看评论"],"menu":"美食日志列表","menuJump":"列表","tableName":"meishirizhi"}],"menu":"美食日志模块"},{"child":[{"buttons":["查看","查看评论"],"menu":"健康文章列表","menuJump":"列表","tableName":"jiankangwenzhang"}],"menu":"健康文章模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
