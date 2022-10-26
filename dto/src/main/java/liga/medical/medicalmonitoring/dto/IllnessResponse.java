package liga.medical.medicalmonitoring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class IllnessResponse {
    private Long id;
    private Long typeId;
    private String heaviness;
    private java.sql.Timestamp appearanceDttm;
    private java.sql.Date recoveryDt;
}