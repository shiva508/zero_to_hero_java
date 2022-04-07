package com.pool.l1.thread.executableservice;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class ExecutorExampleBasics {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(8);
		executorService.submit(()->System.out.println("I'm Runnable task."));
		Future<Integer> future=executorService.submit(()->{
			System.out.println("I'm Callable task.");
            return 1 + 1;
		});
		
		 try {

	            otherTask("Before Future Result");

	            Integer result = future.get(5, TimeUnit.SECONDS);

	            System.out.println("Get future result : " + result);

	            otherTask("After Future Result");


	        } catch (InterruptedException e) {// thread was interrupted
	            e.printStackTrace();
	        } catch (ExecutionException e) {// thread threw an exception
	            e.printStackTrace();
	        } catch (TimeoutException e) {// timeout before the future task is complete
	            e.printStackTrace();
	        } finally {

	            // shut down the executor manually
	        	executorService.shutdown();

	        }
	}
	
	private static void otherTask(String name) {
        System.out.println("I'm other task! " + name);
    }
}
