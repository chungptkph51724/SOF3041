package tester.com.entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SinhVien {
    private Integer id;
    private String ma;
    private String lop;
    private String khoaHoc;
    private String monHoc;

}
