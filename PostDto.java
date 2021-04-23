package hu.HT.harmadikbeadando;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class PostDto {

    public String sText;
    public String sReverse;

}
