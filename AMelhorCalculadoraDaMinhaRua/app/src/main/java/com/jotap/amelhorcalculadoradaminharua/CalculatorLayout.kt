
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement.SpaceBetween
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jotap.amelhorcalculadoradaminharua.Components.BigBottom
import com.jotap.amelhorcalculadoradaminharua.Components.BigEqualBottom
import com.jotap.amelhorcalculadoradaminharua.Components.RegularBottom
import com.jotap.amelhorcalculadoradaminharua.ui.theme.MyBlue1
import com.jotap.amelhorcalculadoradaminharua.ui.theme.MyBlue2
import com.jotap.amelhorcalculadoradaminharua.ui.theme.MyBlue3
import com.jotap.amelhorcalculadoradaminharua.ui.theme.MyBlue4


@Preview
@Composable
fun CalculatorLayout() {

    var variableValue by remember { mutableStateOf("0") }
    val buttonText by remember { mutableStateOf("0") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .background(
                    color = MyBlue1,
                    shape = RoundedCornerShape(16.dp)
                )
                .padding(16.dp)
        ) {
            Text(
                text = "A melhor calculadora da minha rua",
                fontFamily = FontFamily.Default,
                color = Color.Blue,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
            )
        }

        Spacer(modifier = Modifier.height(10.dp))

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(270.dp)
                .background(
                    color = MyBlue1,
                    shape = RoundedCornerShape(16.dp)
                )
                .padding(16.dp)
        ) {
            Text(
                text = variableValue,
                fontFamily = FontFamily.Monospace,
                color = Color.Blue,
                textAlign = TextAlign.End,
                fontSize = 40.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.BottomEnd)
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .background(
                    color = MyBlue3)
                .padding(10.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp)
                    .padding(10.dp),
                horizontalArrangement = SpaceBetween
            ) {
                BigBottom(text = "AC", myColor1 = MyBlue2) { buttonText ->
                    variableValue = "$variableValue$buttonText"
                }
                Spacer(modifier = Modifier.width(16.dp))
                BigBottom(text = "Del", myColor1 = MyBlue2) { buttonText ->
                    variableValue = "$variableValue$buttonText"
                }
                Spacer(modifier = Modifier.width(16.dp))
                RegularBottom(text = "%", myColor1 = MyBlue2) { buttonText ->
                    variableValue = "$variableValue$buttonText"
                }
                Spacer(modifier = Modifier.width(16.dp))
                RegularBottom(text = "/", myColor1 = MyBlue2) { buttonText ->
                    variableValue = "$variableValue$buttonText"
                }
            }
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .background(
                    color = MyBlue3)
                .padding(10.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp)
                    .padding(10.dp),
                horizontalArrangement = SpaceBetween
            ) {
                RegularBottom(text = "7", myColor1 = MyBlue1) { buttonText ->
                    variableValue = "$variableValue$buttonText"
                }
                Spacer(modifier = Modifier.width(16.dp))
                RegularBottom(text = "8", myColor1 = MyBlue1) { buttonText ->
                    variableValue = "$variableValue$buttonText"
                }
                Spacer(modifier = Modifier.width(16.dp))
                RegularBottom(text = "9", myColor1 = MyBlue1) { buttonText ->
                    variableValue = "$variableValue$buttonText"
                }
                Spacer(modifier = Modifier.width(16.dp))
                RegularBottom(text = "*", myColor1 = MyBlue2) { buttonText ->
                    variableValue = "$variableValue$buttonText"
                }
            }
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .background(
                    color = MyBlue3)
                .padding(10.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp)
                    .padding(10.dp),
                horizontalArrangement = SpaceBetween
            ) {
                RegularBottom(text = "4", myColor1 = MyBlue1) { buttonText ->
                    variableValue = "$variableValue$buttonText"
                }
                Spacer(modifier = Modifier.width(16.dp))
                RegularBottom(text = "5", myColor1 = MyBlue1) { buttonText ->
                    variableValue = "$variableValue$buttonText"
                }
                Spacer(modifier = Modifier.width(16.dp))
                RegularBottom(text = "6", myColor1 = MyBlue1) { buttonText ->
                    variableValue = "$variableValue$buttonText"
                }
                Spacer(modifier = Modifier.width(16.dp))
                RegularBottom(text = "-", myColor1 = MyBlue2) { buttonText ->
                    variableValue = "$variableValue$buttonText"
                }
            }
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .background(
                    color = MyBlue3)
                .padding(10.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp)
                    .padding(10.dp),
                horizontalArrangement = SpaceBetween
            ) {
                RegularBottom(text = "1", myColor1 = MyBlue1) { buttonText ->
                    variableValue = "$variableValue$buttonText"
                }
                Spacer(modifier = Modifier.width(16.dp))
                RegularBottom(text = "2", myColor1 = MyBlue1) { buttonText ->
                    variableValue = "$variableValue$buttonText"
                }
                Spacer(modifier = Modifier.width(16.dp))
                RegularBottom(text = "3", myColor1 = MyBlue1) { buttonText ->
                    variableValue = "$variableValue$buttonText"
                }
                Spacer(modifier = Modifier.width(16.dp))
                RegularBottom(text = "+", myColor1 = MyBlue2) { buttonText ->
                    variableValue = "$variableValue$buttonText"
                }
            }
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .background(
                    color = MyBlue3)
                .padding(10.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp)
                    .padding(10.dp),
                horizontalArrangement = SpaceBetween
            ) {
                BigBottom(text = "0", myColor1 = MyBlue2) { buttonText ->
                    variableValue = "$variableValue$buttonText"
                }
                Spacer(modifier = Modifier.width(16.dp))
                BigBottom(text = ".", myColor1 = MyBlue2) { buttonText ->
                    variableValue = "$variableValue$buttonText"
                }
                Spacer(modifier = Modifier.width(16.dp))
                BigEqualBottom(text = "=", myColor1 = MyBlue4) { buttonText ->
                    variableValue = "$variableValue$buttonText"
                }
            }
        }
    }
}