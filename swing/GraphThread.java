package swing;

public class GraphThread implements Runnable{
	TextEditor textEditor;

	public GraphThread(TextEditor textEditor) {
		this.textEditor=textEditor;
	}
	@Override
	public void run() {
		new GExample(textEditor);
	}

}
