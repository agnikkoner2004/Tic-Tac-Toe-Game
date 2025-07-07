// console.log("Hello, World!");
// const student={
//     fullName: "Agnik Koner",
//     age: 20,
//     isStudent: true,
//     subjects: ["Math", "Science", "History"],
// }
// student["age"]= student["age"] + 1; // Increment age by 1
// console.log(student);
// console.log(student["age"])
// mode="light";
// if(mode==="light"){
//     console.log("white");
// }
// let age= 20;
// age>18? console.log("Adult") : console.log("Minor");
// alert("Hello, World!"); // This will show an alert box in the browser
// let name=prompt("Enter your name:"); // This will prompt the user for their name
// console.log("Hello, " + name + "!"); // This will log a greeting message to the console
// let gameNo=59;
// let userNum=prompt("Guess the number:");
// while(userNum!=gameNo){
    
//     userNum=prompt("Wrong guess, try again!");
// }
// alert("Congratulations! You guessed the number.");
// function myFunc(){
//     console.log("Hello, World!");
// }
// myFunc(); // Call the function to execute it
// const arrowFunc =(a,b)=>{
//     console.log(a + b);
// }
// let arr=[1, 2, 3, 4, 5];
// let newEven=arr.filter((num) => {
//     return num % 2 === 0;
// });
// console.log(newEven); // Output: [2, 4]
window.alert("Hi!! You are using my website")
// let firstEl=document.querySelectorAll(".MyClass");
// console.log(firstEl); // This will log all elements with the class "MyClass" to the console
// let divs=document.querySelectorAll(".Box");
// console.log(divs); // This will log all elements with the class "Box" to the
// let idx=0;
// for(div of divs){
//     div.innerText=`value is ${idx}`;
//     idx++;
// }
// let newBut=document.querySelector("#btn1");
// let a=0;
// newBut.onclick=()=>{
//     alert("Button clicked!");
//     console.log("Button was clicked!");
//     a++;
//     console.log(a); // This will log the incremented value of 'a' to theconsole
//     newBut.innerText=`Clicked ${a} times`;
// }
// let box=document.querySelector(".Box");
// box.onmouseover=()=>{
//     console.log("Mouse is over the div!");
// };
// newBut.addEventListener("click", evt => {
//     console.log(evt);
//     console.log(evt.Type);
// });
let newbut=document.querySelector("#btn1");
let body=document.querySelector("body");
let currMode="light";
newbut.onclick=()=>{
    if(currMode==="light"){
        currMode="dark";
        console.log("Dark Mode");
        body.style.backgroundColor="black";
    } else {                
        console.log("Light Mode");
        currMode="light";
        body.style.backgroundColor="white";
        // body.style.text="white";

    }
console.log("currMode");
}