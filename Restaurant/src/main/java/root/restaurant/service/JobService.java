package root.restaurant.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import root.restaurant.repository.JobRepository;
import root.restaurant.table.Job;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class JobService {
    private final JobRepository jobRepository;

    public List<Job> getAllJobs(){
        return jobRepository.findAll();
    }

    public Optional<Job> getJobByName(String name){
        return jobRepository.findByJobName(name);
    }
}
