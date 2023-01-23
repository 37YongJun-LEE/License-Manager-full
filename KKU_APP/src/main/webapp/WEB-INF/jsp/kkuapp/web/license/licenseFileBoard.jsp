<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="ui" uri="http://egovframework.gov/ctl/ui"%>
<!doctype html>
<html lang="en">
<head>
<%@include file="../_inc/title.jsp" %>
</head>
<script>
function fnLinkPage(pageNo) {
	$("#pageIndex").val(pageNo);
	$("#schFrm").submit();
}
function fnSearch(){
	$("#pageIndex").val('1');
	$("#schFrm").submit();
}
</script>
<body>

	<div id="wrap">
	<!-- HEADER BEGIN -->
	<header class="sub">
	<%@include file="../_inc/header.jsp" %>
	</header>
	<!-- HEADER END -->


	<!-- CONTENTS BEGIN -->
		<div id="sub_contents" class="board head_mg mb140">
			<!-- <div class="tab">
				<ul>
					<li><a href="board.do" class="on">자유게시판</a></li>
					<li><a href="themeboard_list.do">주제별 게시판</a></li>
					<!-- <li><a href="school_info.do">학교 정보</a></li> 
				</ul>
			</div>-->
			
			<div class="navi small">
				<div class="top_navi"><a href="/licenseView.do?subjectCd=${sub.subjectCd}"><img src="/_img/_img/cont/navi_arrow.png"></a><h2>${sub.subjectName} 기출문제 자료실</h2></div>
			</div>
			
			<div class="w_box no_line">
				<form name="schFrm" id="schFrm" method="post" action="<c:url value='/licenseFileBoard.do?subjectCd=${vo.subjectCd}'/>">
					<input type="hidden" name="pageIndex" id="pageIndex" value="${vo.pageIndex}" />
					<div class="search">
						<select name="searchCondition">
							<option value="All" <c:if test="${vo.searchCondition eq ''}">selected</c:if>>전체</option>
							<option value="quesTitle" <c:if test="${vo.searchCondition == 'quesTitle'}">selected="selected"</c:if>>제목</option>
							
							<option value="quesContents" <c:if test="${vo.searchCondition == 'quesContents'}">selected="selected"</c:if>>내용</option>
							
						</select>
						<p class="input_box">
							<input name="searchKeyword" value="${vo.searchKeyword}" type="text" placeholder="게시물 검색">
							<a href="javascript:fnSearch();" id="schButton"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M500.3 443.7l-119.7-119.7c27.22-40.41 40.65-90.9 33.46-144.7C401.8 87.79 326.8 13.32 235.2 1.723C99.01-15.51-15.51 99.01 1.724 235.2c11.6 91.64 86.08 166.7 177.6 178.9c53.8 7.189 104.3-6.236 144.7-33.46l119.7 119.7c15.62 15.62 40.95 15.62 56.57 0C515.9 484.7 515.9 459.3 500.3 443.7zM79.1 208c0-70.58 57.42-128 128-128s128 57.42 128 128c0 70.58-57.42 128-128 128S79.1 278.6 79.1 208z"></path></svg></a>
						</p>
					</div>
				</form>
				<div class="list_top">
				</div>
				
				<ul class="best_list basic">
				<c:choose>
				<c:when test="${fileList ne null}">
					<c:forEach var="flist" items="${fileList}">
					<li onclick="location.href='/licenseFileView.do?quesIdx=${flist.quesIdx}'">
						<div>
							<div>
								<p class="tit">${flist.quesTitle}</p>
							</div>
							<p class="bottom">
								<span>등록일 ${flist.queRegdt}</span>
							</p>
						</div>
						<!-- <p class="img">
							<c:if test="${majorNotice.first != null}">
								<img alt="학과 공지" src="/_img/_img/cont/best_bg.png" style="background: url(/upload/board/${majorNotice.first })no-repeat 50% 50%/cover;">
							</c:if>
						</p> -->
					</li>
					</c:forEach>
				</c:when>
						<c:otherwise>
							<li class="nodata">등록된 게시글이 없습니다.</li> 
						</c:otherwise>
				</c:choose>
				</ul>
				
				
				<p class="paging">
					<ui:pagination paginationInfo="${paginationInfo}" type="image" jsFunction="fnLinkPage"/>
				</p> 
				</div>

			<%@include file="../_inc/bottom_menu.jsp" %>
			<%@include file="../_inc/footer.jsp" %>
		</div>
	<!-- CONTENTS END -->
	
</div>
<!-- //wrap -->

</body>
</html>