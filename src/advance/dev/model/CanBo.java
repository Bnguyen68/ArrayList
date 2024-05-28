package advance.dev.model;

public class CanBo {
	private String ten;
	private int tuoi;
	private String gioiTinh;
	private String diaChi;

	// khởi tạo
	public CanBo(String ten, int tuoi, String gioiTinh, String diaChi) {
		this.ten = ten; //khoi tạo tên
		this.tuoi = tuoi;
		this.gioiTinh = gioiTinh;
		this.diaChi = diaChi;
	}

	// Getters and Setters
	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten; //goi ten
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
}
