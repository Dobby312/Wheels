/**
 * @author Dobby
 * Dec 30, 2019
 */
package demo.schedule;

import java.time.LocalDateTime;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
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
@EnableAsync  //开启多线程任务
public class AsyncScheduleTask {

	@Async
	@Scheduled(fixedRate=2000)
	public void AsyncTask() throws InterruptedException {
		System.out.println("第一个任务 ："+ LocalDateTime.now().toLocalTime() + "\r\n线程 : " + Thread.currentThread().getName());
	}
	
	@Async
	@Scheduled(fixedRate=3000)
	public void AsyncTask2() throws InterruptedException {
		System.out.println("第二个定时任务开始 : " + LocalDateTime.now().toLocalTime() + "\r\n线程 : " + Thread.currentThread().getName());
	}
}

