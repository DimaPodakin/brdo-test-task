package test_task;

import java.util.List;
import test_task.dto.ApiResponseDto;
import test_task.model.Comment;
import test_task.service.HttpClient;
import test_task.service.InsertTime;
import test_task.service.ReportCreator;
import test_task.service.ReportWriterToFile;
import test_task.service.UserNameChanger;
import test_task.service.impl.InsertTimeImpl;
import test_task.service.impl.ReportCreatorImpl;
import test_task.service.impl.ReportWriterToFileImpl;
import test_task.service.impl.UserNameChangerImpl;

public class Main {
    private static final String PATH_TO_FILE = "src/main/resources/report.txt";
    private static final String LINK = "https://dummyjson.com/comments";

    public static void main(String[] args) {
        HttpClient httpClient = new HttpClient();
        ApiResponseDto apiResponseDto = httpClient.get(LINK, ApiResponseDto.class);
        List<Comment> comments = List.of(apiResponseDto.getComments());

        InsertTime time = new InsertTimeImpl();
        time.insertTime(comments);

        UserNameChanger nameChanger = new UserNameChangerImpl();
        nameChanger.updateUsername(comments);

        ReportCreator reportCreator = new ReportCreatorImpl();
        String report = reportCreator.createReport(comments);

        ReportWriterToFile writerToFile = new ReportWriterToFileImpl();
        writerToFile.write(PATH_TO_FILE, report);
    }
}
