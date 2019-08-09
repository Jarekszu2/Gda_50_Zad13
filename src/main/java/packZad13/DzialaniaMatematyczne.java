package packZad13;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class DzialaniaMatematyczne {
    private RodzajOperacji rodzajOperacji;
    private LocalDateTime start;
    private LocalDateTime end;
    private int correctAnswer;
    private int incorrectAnswer;
}
