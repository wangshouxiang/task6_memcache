<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles-extras" prefix="tilesx" %>
<div>
  <tiles:insertAttribute name="head" />
  <tiles:insertAttribute name="content" />
  <tiles:insertAttribute name="footer" />
</div>