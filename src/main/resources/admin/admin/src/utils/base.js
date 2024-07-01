const base = {
    get() {
        return {
            url : "http://localhost:8080/springbooted1p6/",
            name: "springbooted1p6",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springbooted1p6/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "厨艺交流平台"
        } 
    }
}
export default base
