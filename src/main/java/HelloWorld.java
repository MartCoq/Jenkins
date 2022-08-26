import spark.servlet.SparkApplication;

import static spark.Spark.get;

public class HelloWorld implements SparkApplication {
	public static void main(String[] args) {
		new HelloWorld().init();
	}

	@Override
	public void init() {
	
		get("/", (req, res) -> "Goodbye World");
		get("/hello", (req, res) -> "Hello World Kikoulol cç marche");
		get("/test", (req, res) -> "Kikoulol");

	}
}
