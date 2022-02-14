import React from 'react';
import { Task } from "../../models/task.class";
import { LEVELS } from "../../models/levels.enum";
import TaskComponent from "../pure/taskComponent";

const TaskListComponent = () => {

  const defaultTask = new Task('Example', 'Default description', false, LEVELS.NORMAL);

  return (
    <div>
      <div>
        Your tasks:
      </div>
      {/* TODO: Aplicar un for/map para renderizar una lista*/}
      <TaskComponent task={defaultTask} />
    </div>
  );
};

export default TaskListComponent;