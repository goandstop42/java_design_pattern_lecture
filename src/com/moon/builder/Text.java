package com.moon.builder;

public class Text {

	private String text;

	@Override
	public String toString() {
		return text;
	}
	
	//staic 반드시 붙여야 Text class와 Builder class와 관계가 없어짐
	//Main에서 Text.Builder로 사용
	public static class Builder{
		private String title;
		private String content;
		private String[] items;
		
		public Builder setTitle(String title) {
			this.title = title;
			return this;
		}
		public Builder setContent(String content) {
			this.content = content;
			return this;
		}
		
		public Builder setItems(String... items) {
			this.items = items;
			return this;
		}
		
		public Text build() {
			Text text = new Text();
			
			StringBuilder sb = new StringBuilder();
			sb.append("타이틀 : ").append(title).append("\n");
			sb.append("내용 : ").append(content).append("\n");
			sb.append("항목 : ").append("\n");
			for(String item : items) {
				sb.append(" - ").append(item).append("\n");
			}
			text.text = toString();
			
			return text;
		}
	}
	
	
}
