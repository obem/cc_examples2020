import React from "react";
import { observer } from "mobx-react";

export default class ToDoList extends React.Component {
  toDoStore = this.props.toDoStore;
  toDos = this.toDoStore.toDos;

  render() {
    return (
      <div>
        {this.toDos.map((toDo) => {
          return (
            <div>
              {toDo.description} {toDo.isDone.toString()}
            </div>
          );
        })}
        <button onClick={() => this.toDoStore.addToDo("go shopping")}>
          Hinzufügen
        </button>
      </div>
    );
  }
}

observer(ToDoList);
