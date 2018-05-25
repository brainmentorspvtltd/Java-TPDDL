/**
 * 
 */

  window.addEventListener("load", init);

        function init() {
            var arr = document.querySelectorAll(".mystyle");
            for (let i = 0; i < arr.length; i++) {
                arr[i].addEventListener("click", callAjax);
            }
        }

        function callAjax(){
        	var screenName =this.getAttribute("linking");
        	console.log("Screen Name is ",screenName);
        	doAjax(screenName);
        }
        

function doAjax(screenName) {
	var baseURL = "http://localhost:8080/WebApp/"+screenName;
           // var url = "https://raw.githubusercontent.com/brainmentorspvtltd/myserverdata/master/mobiles.json";
            //fetch(url).then(success).catch(fail);
            fetch(baseURL).then(response => {
            	console.log("Response Coming from Server is ");
            	console.log("Response ",response);
            	response.text().then(data=>{
            		document.querySelector("#result").innerHTML = data;
            	}).catch(err=>{
            		console.log("Error is ",err);
            	})
//                response.json().then(data => {
//                    console.log("data is ", data);
//                }).catch(err => {
//                    console.log("Invalid JSON ", err);
//                })
                //console.log("Response is ", response);
            }).catch(err => {
                console.log("Fail is ", err);
            });
        }
