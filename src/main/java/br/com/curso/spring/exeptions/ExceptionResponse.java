package br.com.curso.spring.exeptions;

import java.util.Date;

public record ExceptionResponse(Date timestamp, String mensagem, String datails) {}
