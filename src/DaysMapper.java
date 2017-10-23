import java.io.IOException;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.mapreduce.Mapper;

public class DaysMapper extends Mapper<Object, Text, Text, IntWritable> {
    private final IntWritable one = new IntWritable(1);
    private Text data = new Text();
    public void map(Object key, Text line, Context context) throws IOException, InterruptedException {
          String[] entry = line.toString().split(",");
	  //data.set(entry[1]);
	  context.write(new Text(entry[1]), one);
    }
}
