let boxes=document.querySelectorAll('.box');
let reset=document.querySelector('#reset');
let mg=document.querySelector('#mg');
let mgContainer=document.querySelector('.Mg-Container');
let newGameButton=document.querySelector('#new');
let turn0=true;
const winningCombos=[
    [0,1,2],
    [0,3,6],
    [0,4,8],
    [1,4,7],
    [2,5,8],
    [2,4,6],
    [3,4,5],
    [6,7,8]
];
const resetGame=()=>{
    turn0=true;
    enabledBoxes();
    mgContainer.classList.add('hide');
}
boxes.forEach((box)=>{
    box.addEventListener("click",()=>{
       console.log("Box clicked");
       if(turn0){
        box.innerText="O";
        turn0=false;
       }else{
        box.innerText="X";
        turn0=true;
       }
       box.disabled = true;
         checkWinner();
    });
});

const disabledBoxes=()=>{
    boxes.forEach((box)=>{
        box.disabled=true;
    });
};
const enabledBoxes=()=>{
    boxes.forEach((box)=>{
        box.disabled=false;
        box.innerText="";
    });
};

const showWinner=(winner)=>{
    mg.innerText=`Congratulations ${winner} is the winner`;
    mgContainer.classList.remove('hide');
    disabledBoxes();
}
const checkWinner=()=>{
    for(pattarn of winningCombos){
        let pos1=boxes[pattarn[0]].innerText;
        let pos2=boxes[pattarn[1]].innerText;   
        let pos3=boxes[pattarn[2]].innerText;
        if(pos1!="" && pos2!="" && pos3!=""){
            if(pos1===pos2 && pos2===pos3){
                console.log("Winner found",pos1);
                showWinner(pos1);
            }
            
        }
    }
};
newGameButton.addEventListener('click',()=>{
    resetGame();
});
reset.addEventListener('click',()=>{
    alert("Are you sure you want to reset the game?");
    
    resetGame();
});