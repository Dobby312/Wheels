/**
 * @author Dobby
 * Dec 30, 2019
 */
package demo.schedule;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author Dobby
 *
 * Dec 30, 2019
 */
@Component
@EnableScheduling
public class ScheduleTask {

	//延迟两秒执行
	@Test
	@Scheduled(fixedRate=2000)
	public void Task() {
		System.out.println("执行定时时间任务"+LocalDateTime.now());
	}
}
