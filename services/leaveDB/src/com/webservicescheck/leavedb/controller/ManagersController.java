/*Copyright (c) 2015-2016 gmail.com All Rights Reserved.
 This software is the confidential and proprietary information of gmail.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with gmail.com*/
package com.webservicescheck.leavedb.controller;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wavemaker.commons.wrapper.StringWrapper;
import com.wavemaker.runtime.data.export.DataExportOptions;
import com.wavemaker.runtime.data.export.ExportType;
import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.data.model.AggregationInfo;
import com.wavemaker.runtime.file.manager.ExportedFileManager;
import com.wavemaker.runtime.file.model.Downloadable;
import com.wavemaker.tools.api.core.annotations.WMAccessVisibility;
import com.wavemaker.tools.api.core.models.AccessSpecifier;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;

import com.webservicescheck.leavedb.EmpDetails;
import com.webservicescheck.leavedb.Managers;
import com.webservicescheck.leavedb.service.ManagersService;


/**
 * Controller object for domain model class Managers.
 * @see Managers
 */
@RestController("leaveDB.ManagersController")
@Api(value = "ManagersController", description = "Exposes APIs to work with Managers resource.")
@RequestMapping("/leaveDB/Managers")
public class ManagersController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ManagersController.class);

    @Autowired
	@Qualifier("leaveDB.ManagersService")
	private ManagersService managersService;

	@Autowired
	private ExportedFileManager exportedFileManager;

	@ApiOperation(value = "Creates a new Managers instance.")
    @RequestMapping(method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Managers createManagers(@RequestBody Managers managers) {
		LOGGER.debug("Create Managers with information: {}" , managers);

		managers = managersService.create(managers);
		LOGGER.debug("Created Managers with information: {}" , managers);

	    return managers;
	}

    @ApiOperation(value = "Returns the Managers instance associated with the given id.")
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Managers getManagers(@PathVariable("id") Integer id) {
        LOGGER.debug("Getting Managers with id: {}" , id);

        Managers foundManagers = managersService.getById(id);
        LOGGER.debug("Managers details with id: {}" , foundManagers);

        return foundManagers;
    }

    @ApiOperation(value = "Updates the Managers instance associated with the given id.")
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.PUT)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Managers editManagers(@PathVariable("id") Integer id, @RequestBody Managers managers) {
        LOGGER.debug("Editing Managers with id: {}" , managers.getManagerId());

        managers.setManagerId(id);
        managers = managersService.update(managers);
        LOGGER.debug("Managers details with id: {}" , managers);

        return managers;
    }

    @ApiOperation(value = "Deletes the Managers instance associated with the given id.")
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.DELETE)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public boolean deleteManagers(@PathVariable("id") Integer id) {
        LOGGER.debug("Deleting Managers with id: {}" , id);

        Managers deletedManagers = managersService.delete(id);

        return deletedManagers != null;
    }

    /**
     * @deprecated Use {@link #findManagers(String, Pageable)} instead.
     */
    @Deprecated
    @ApiOperation(value = "Returns the list of Managers instances matching the search criteria.")
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<Managers> searchManagersByQueryFilters( Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
        LOGGER.debug("Rendering Managers list by query filter:{}", (Object) queryFilters);
        return managersService.findAll(queryFilters, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of Managers instances matching the optional query (q) request param. If there is no query provided, it returns all the instances. Pagination & Sorting parameters such as page& size, sort can be sent as request parameters. The sort value should be a comma separated list of field names & optional sort order to sort the data on. eg: field1 asc, field2 desc etc ")
    @RequestMapping(method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<Managers> findManagers(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering Managers list by filter:", query);
        return managersService.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of Managers instances matching the optional query (q) request param. This API should be used only if the query string is too big to fit in GET request with request param. The request has to made in application/x-www-form-urlencoded format.")
    @RequestMapping(value="/filter", method = RequestMethod.POST, consumes= "application/x-www-form-urlencoded")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<Managers> filterManagers(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering Managers list by filter", query);
        return managersService.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns downloadable file for the data matching the optional query (q) request param. If query string is too big to fit in GET request's query param, use POST method with application/x-www-form-urlencoded format.")
    @RequestMapping(value = "/export/{exportType}", method = {RequestMethod.GET,  RequestMethod.POST}, produces = "application/octet-stream")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Downloadable exportManagers(@PathVariable("exportType") ExportType exportType, @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
         return managersService.export(exportType, query, pageable);
    }

    @ApiOperation(value = "Returns a URL to download a file for the data matching the optional query (q) request param and the required fields provided in the Export Options.") 
    @RequestMapping(value = "/export", method = {RequestMethod.POST}, consumes = "application/json")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public StringWrapper exportManagersAndGetURL(@RequestBody DataExportOptions exportOptions, Pageable pageable) {
        String exportedFileName = exportOptions.getFileName();
        if(exportedFileName == null || exportedFileName.isEmpty()) {
            exportedFileName = Managers.class.getSimpleName();
        }
        exportedFileName += exportOptions.getExportType().getExtension();
        String exportedUrl = exportedFileManager.registerAndGetURL(exportedFileName, outputStream -> managersService.export(exportOptions, pageable, outputStream));
        return new StringWrapper(exportedUrl);
    }

	@ApiOperation(value = "Returns the total count of Managers instances matching the optional query (q) request param. If query string is too big to fit in GET request's query param, use POST method with application/x-www-form-urlencoded format.")
	@RequestMapping(value = "/count", method = {RequestMethod.GET, RequestMethod.POST})
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public Long countManagers( @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query) {
		LOGGER.debug("counting Managers");
		return managersService.count(query);
	}

    @ApiOperation(value = "Returns aggregated result with given aggregation info")
	@RequestMapping(value = "/aggregations", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public Page<Map<String, Object>> getManagersAggregatedValues(@RequestBody AggregationInfo aggregationInfo, Pageable pageable) {
        LOGGER.debug("Fetching aggregated results for {}", aggregationInfo);
        return managersService.getAggregatedValues(aggregationInfo, pageable);
    }

    @RequestMapping(value="/{id:.+}/empDetailses", method=RequestMethod.GET)
    @ApiOperation(value = "Gets the empDetailses instance associated with the given id.")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<EmpDetails> findAssociatedEmpDetailses(@PathVariable("id") Integer id, Pageable pageable) {

        LOGGER.debug("Fetching all associated empDetailses");
        return managersService.findAssociatedEmpDetailses(id, pageable);
    }

    /**
	 * This setter method should only be used by unit tests
	 *
	 * @param service ManagersService instance
	 */
	protected void setManagersService(ManagersService service) {
		this.managersService = service;
	}

}