import './App.css';
import Greeting from './components/pure/greeting';
import GreetingF from "./components/pure/greetingF";
import TaskListComponent from "./components/containers/task_list";

function App() {
  return (
    <div className="App">
      <TaskListComponent />
    </div>
  );
}

export default App;
