package com.example.MasterProjektAnbieter;

import com.example.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EmployeeMapper {

    EmployeeMapper INSTANCE = Mappers.getMapper(EmployeeMapper.class);
    @Mapping(target="employeeId", source="id")
    @Mapping(target="employeeName", source="zweiteKlasse.neuerName")
    EmployeeDTO employeeToEmployeeDTO(Employee entity);

    @Mapping(target="id", source="employeeId")
    @Mapping(target="name", source="employeeName")
    Employee employeeDTOtoEmployee(EmployeeDTO dto);
}
