import React from "react";
import "./App.css";
import ToDoList from "./compontents/ToDoList/ToDoList";
import ToDoStore from "./stores/ToDoStore";
import Comp from "./compontents/comp/Comp";

const toDoStore = new ToDoStore();

function App() {
  return (
    <div className="App">
      <ToDoList toDoStore={toDoStore} />
      <Comp toDoStore={toDoStore} />
    </div>
  );
}

export default App;
