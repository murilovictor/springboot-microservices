package com.microservices.trainning.course.endpoint.controller;


import com.microservices.trainning.course.endpoint.service.CourseService;
import core.model.Course;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * CourseController
 */
@RestController
@RequestMapping("v1/admin/course")
@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Api(value = "Endpoint to manage course")
public class CourseController {

    private final CourseService courseService;

    @ApiOperation(value = "List all avaliable courses", response = Course[].class)
    @GetMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Iterable<Course>> list(Pageable pageable) {
        log.info("Get listAll");
        return new ResponseEntity<>(courseService.list(pageable), HttpStatus.OK);
    }
    

}