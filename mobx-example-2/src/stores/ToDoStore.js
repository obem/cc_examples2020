import { observable, decorate, action } from "mobx";

const { fetchToDos } = require("../util/HttpHelper");

export default class ToDoStore {
  toDos = [];

  constructor() {
    this.toDos = fetchToDos();
  }

  addToDo(task) {
    console.log(task);
    this.toDos.push({
      description: task,
      isDone: false,
    });
  }
}

decorate(ToDoStore, {
  toDos: observable,
  addToDo: action,
});
