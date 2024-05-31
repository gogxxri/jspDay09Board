package org.comstudy.web.board.model;

import java.util.Objects;

public class BoardDTO {

	int anum;
	String author;
	String email;
	String title;
	String content;
	String password;
	String writeday;
	int readcnt;
	int rep_root;
	int step;
	int indent;
	
	public BoardDTO() {
		this(0, "", "", "", "", "", "", 0, 0, 0, 0);
	}
	
	

	public BoardDTO(int anum) {
		this(anum, "", "", "", "", "", "", 0, 0, 0, 0);
	}

	public BoardDTO(String author, String email, String title, String content, String password) {
		this(0, "author", "email", "title", "content", "password", "", 0, 0, 0, 0);
	}
	
	
	
	public BoardDTO(int anum, String author, String email, String title, String content, String password,
			String writeday, int readcnt, int rep_root, int step, int indent) {
		this.anum = anum;
		this.author = author;
		this.email = email;
		this.title = title;
		this.content = content;
		this.password = password;
		this.writeday = writeday;
		this.readcnt = readcnt;
		this.rep_root = rep_root;
		this.step = step;
		this.indent = indent;
	}
	public int getAnum() {
		return anum;
	}



	public void setAnum(int anum) {
		this.anum = anum;
	}



	public String getAuthor() {
		return author;
	}



	public void setAuthor(String author) {
		this.author = author;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getContent() {
		return content;
	}



	public void setContent(String content) {
		this.content = content;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getWriteday() {
		return writeday;
	}



	public void setWriteday(String writeday) {
		this.writeday = writeday;
	}



	public int getReadcnt() {
		return readcnt;
	}



	public void setReadcnt(int readcnt) {
		this.readcnt = readcnt;
	}



	public int getRep_root() {
		return rep_root;
	}



	public void setRep_root(int rep_root) {
		this.rep_root = rep_root;
	}



	public int getStep() {
		return step;
	}



	public void setStep(int step) {
		this.step = step;
	}



	public int getIndent() {
		return indent;
	}



	public void setIndent(int indent) {
		this.indent = indent;
	}



	@Override
	public int hashCode() {
		return Objects.hash(anum);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BoardDTO other = (BoardDTO) obj;
		return anum == other.anum;
	}



	@Override
	public String toString() {
		return "BoardDTO [anum=" + anum + ", author=" + author + ", email=" + email + ", title=" + title + ", content="
				+ content + ", password=" + password + ", writeday=" + writeday + ", readcnt=" + readcnt + ", rep_root="
				+ rep_root + ", step=" + step + ", indent=" + indent + "]";
	}



	
	

}
