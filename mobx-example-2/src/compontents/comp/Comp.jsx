import React from "react";
import { observer } from "mobx-react";

export default class Comp extends React.Component {
  store = this.props.toDoStore;
  toDos = this.store.toDos;

  render() {
    return (
      <div>
        {this.toDos.map((toDo) => {
          return <div>{toDo.description} </div>;
        })}
      </div>
    );
  }
}

observer(Comp);
