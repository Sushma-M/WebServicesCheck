/*Copyright (c) 2015-2016 gmail.com All Rights Reserved.
 This software is the confidential and proprietary information of gmail.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with gmail.com*/
package com.webservicescheck.leavedb.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.OutputStream;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.wavemaker.runtime.data.exception.EntityNotFoundException;
import com.wavemaker.runtime.data.export.DataExportOptions;
import com.wavemaker.runtime.data.export.ExportType;
import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.data.model.AggregationInfo;
import com.wavemaker.runtime.file.model.Downloadable;

import com.webservicescheck.leavedb.EmpDetails;

/**
 * Service object for domain model class {@link EmpDetails}.
 */
public interface EmpDetailsService {

    /**
     * Creates a new EmpDetails. It does cascade insert for all the children in a single transaction.
     *
     * This method overrides the input field values using Server side or database managed properties defined on EmpDetails if any.
     *
     * @param empDetails Details of the EmpDetails to be created; value cannot be null.
     * @return The newly created EmpDetails.
     */
    EmpDetails create(@Valid EmpDetails empDetails);


	/**
     * Returns EmpDetails by given id if exists.
     *
     * @param empdetailsId The id of the EmpDetails to get; value cannot be null.
     * @return EmpDetails associated with the given empdetailsId.
	 * @throws EntityNotFoundException If no EmpDetails is found.
     */
    EmpDetails getById(Integer empdetailsId);

    /**
     * Find and return the EmpDetails by given id if exists, returns null otherwise.
     *
     * @param empdetailsId The id of the EmpDetails to get; value cannot be null.
     * @return EmpDetails associated with the given empdetailsId.
     */
    EmpDetails findById(Integer empdetailsId);

	/**
     * Find and return the list of EmpDetails by given id's.
     *
     * If orderedReturn true, the return List is ordered and positional relative to the incoming ids.
     *
     * In case of unknown entities:
     *
     * If enabled, A null is inserted into the List at the proper position(s).
     * If disabled, the nulls are not put into the return List.
     *
     * @param empdetailsIds The id's of the EmpDetails to get; value cannot be null.
     * @param orderedReturn Should the return List be ordered and positional in relation to the incoming ids?
     * @return EmpDetails associated with the given empdetailsIds.
     */
    List<EmpDetails> findByMultipleIds(List<Integer> empdetailsIds, boolean orderedReturn);


    /**
     * Updates the details of an existing EmpDetails. It replaces all fields of the existing EmpDetails with the given empDetails.
     *
     * This method overrides the input field values using Server side or database managed properties defined on EmpDetails if any.
     *
     * @param empDetails The details of the EmpDetails to be updated; value cannot be null.
     * @return The updated EmpDetails.
     * @throws EntityNotFoundException if no EmpDetails is found with given input.
     */
    EmpDetails update(@Valid EmpDetails empDetails);

    /**
     * Deletes an existing EmpDetails with the given id.
     *
     * @param empdetailsId The id of the EmpDetails to be deleted; value cannot be null.
     * @return The deleted EmpDetails.
     * @throws EntityNotFoundException if no EmpDetails found with the given id.
     */
    EmpDetails delete(Integer empdetailsId);

    /**
     * Deletes an existing EmpDetails with the given object.
     *
     * @param empDetails The instance of the EmpDetails to be deleted; value cannot be null.
     */
    void delete(EmpDetails empDetails);

    /**
     * Find all EmpDetails matching the given QueryFilter(s).
     * All the QueryFilter(s) are ANDed to filter the results.
     * This method returns Paginated results.
     *
     * @deprecated Use {@link #findAll(String, Pageable)} instead.
     *
     * @param queryFilters Array of queryFilters to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching EmpDetails.
     *
     * @see QueryFilter
     * @see Pageable
     * @see Page
     */
    @Deprecated
    Page<EmpDetails> findAll(QueryFilter[] queryFilters, Pageable pageable);

    /**
     * Find all EmpDetails matching the given input query. This method returns Paginated results.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param query The query to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching EmpDetails.
     *
     * @see Pageable
     * @see Page
     */
    Page<EmpDetails> findAll(String query, Pageable pageable);

    /**
     * Exports all EmpDetails matching the given input query to the given exportType format.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param exportType The format in which to export the data; value cannot be null.
     * @param query The query to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null exports all matching records.
     * @return The Downloadable file in given export type.
     *
     * @see Pageable
     * @see ExportType
     * @see Downloadable
     */
    Downloadable export(ExportType exportType, String query, Pageable pageable);

    /**
     * Exports all EmpDetails matching the given input query to the given exportType format.
     *
     * @param options The export options provided by the user; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null exports all matching records.
     * @param outputStream The output stream of the file for the exported data to be written to.
     *
     * @see DataExportOptions
     * @see Pageable
     * @see OutputStream
     */
    void export(DataExportOptions options, Pageable pageable, OutputStream outputStream);

    /**
     * Retrieve the count of the EmpDetails in the repository with matching query.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param query query to filter results. No filters applied if the input is null/empty.
     * @return The count of the EmpDetails.
     */
    long count(String query);

    /**
     * Retrieve aggregated values with matching aggregation info.
     *
     * @param aggregationInfo info related to aggregations.
     * @param pageable Details of the pagination information along with the sorting options. If null exports all matching records.
     * @return Paginated data with included fields.
     *
     * @see AggregationInfo
     * @see Pageable
     * @see Page
	 */
    Page<Map<String, Object>> getAggregatedValues(AggregationInfo aggregationInfo, Pageable pageable);


}