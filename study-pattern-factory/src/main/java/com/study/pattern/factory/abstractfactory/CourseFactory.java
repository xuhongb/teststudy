package com.study.pattern.factory.abstractfactory;

public interface CourseFactory {
    INote createNote();

    IVideo createVideo();
}
