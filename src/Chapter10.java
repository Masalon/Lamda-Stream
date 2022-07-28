import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Chapter10 {
	public static void main(String[] args) throws Exception {
		List<Task> list = new ArrayList<>();
		list.add(new Task(LocalDate.of(2021, 10, 21), "牛乳を買う", true));
		list.add(new Task(LocalDate.of(2021, 9, 15), "○○社面接", false));
		list.add(new Task(LocalDate.of(2021, 12, 4), "手帳を買う", true));
		list.add(new Task(LocalDate.of(2021, 8, 10), "散髪に行く", false));
		list.add(new Task(LocalDate.of(2021, 11, 9), "スクールの課題を解く", false));

		// filter through the "false" stuff and add it to the incompleteTasks list
		List<Task> incompleteTasks = list.stream().filter(var -> var.isDone() == false).collect(Collectors.toList());
		// print out the size of the list
		System.out.println("未完了のタスクの個数は" + incompleteTasks.size());
		// print out the line told to print
		System.out.println("【未完了のタスクを昇順に並び替えて一覧表示】");
		// sort the list in order and print each one
		incompleteTasks.stream().sorted().forEach(System.out::println);
	}
}

// List<Task> incompleteTasks = new ArrayList<>();
// for (Task var : list) {
// if (var.isDone() == false) {
// incompleteTasks.add(var);

// System.out.println("未完了のタスクの個数は" + incompleteTasks.size());
// make it sort the 3 incomplete tasks
// Collections.sort(incompleteTasks);
// System.out.println("【未完了のタスクを昇順に並び替えて一覧表示】");
// make it print each task individually
// for (Task aTask : incompleteTasks) {
// System.out.println(aTask);