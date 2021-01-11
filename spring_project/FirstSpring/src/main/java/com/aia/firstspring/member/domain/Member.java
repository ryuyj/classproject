package com.aia.firstspring.member.domain;

import java.sql.Timestamp;
import java.util.Date;

public class Member {

	private int idx;
	private String memberid;
	private String paswsword;
	private String membername;
	private String memberphoto;
	private Timestamp regdate;

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getMemberid() {
		return memberid;
	}

	public void setMemberid(String memberid) {
		this.memberid = memberid;
	}

	public String getPaswsword() {
		return paswsword;
	}

	public void setPaswsword(String paswsword) {
		this.paswsword = paswsword;
	}

	public String getMembername() {
		return membername;
	}

	public void setMembername(String membername) {
		this.membername = membername;
	}

	public String getMemberphoto() {
		return memberphoto;
	}

	public void setMemberphoto(String memberphoto) {
		this.memberphoto = memberphoto;
	}

	public Timestamp getRegdate() {
		return regdate;
	}

	public void setRegdate(Timestamp regdate) {
		this.regdate = regdate;
	}
	
	public Date getToDate() { // ${member.toDate}
		return new Date(getRegdate().getTime());
	}

	@Override
	public String toString() {
		return "Member [idx=" + idx + ", memberid=" + memberid + ", paswsword=" + paswsword + ", membername="
				+ membername + ", memberphoto=" + memberphoto + ", regdate=" + regdate + "]";
	}

}