//JavaScript代码区域
    //个人信息
var medicalNumber = -1;
var personalInformation = new Vue({
    el: '#personalInformation',
    data : {
        "person": {
            "id": "",
            "name": "xxx",
            "medicalNumber": "",
            "medicalDate": "",
            "sex": "",
            "age": "",
            "nation": "",
            "job": "",
            "marriage": "",
            "address": ""
        }
    },
    methods: {
        getPersonInfo(){
            //get通过params选项
            axios.get('http://127.0.0.1:8080/personal/getPersonalInfo',{
                params:{
                    "medicalNumber": getUrlKey("medicalNumber")
                }
            })
            .then((response) => {
                var person = response.data.data;
                this.person = person;
                console.log(this.person);
            })
            .catch(function (error) {
                console.log(error);
            });
        }
    },
    mounted: function(){
        if (medicalNumber == -1){
            medicalNumber = getUrlKey("medicalNumber")
        }
        //get通过params选项
        axios.get('http://127.0.0.1:8080/personal/getPersonalInfo',{
            params:{
                "medicalNumber": medicalNumber
            }
        })
        .then((response) => {
            var person = response.data.data;
            this.person = person;
            console.log(this.person);
        })
        .catch(function (error) {
            console.log(error);
        });
    }
});

function getUrlKey(name) {
    return decodeURIComponent((new RegExp('[?|&]' + name + '=' + '([^&;]+?)(&|#|;|$)').exec(location.href) || [, ""])[1].replace(/\+/g, '%20')) || null
}