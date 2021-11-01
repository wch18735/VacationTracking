define(["exports","react","react-dom","mendix/filters/builders"],(function(e,t,a,i){"use strict";var n,r={exports:{}};
/*!
    Copyright (c) 2017 Jed Watson.
    Licensed under the MIT License (MIT), see
    http://jedwatson.github.io/classnames
  */n=r,function(){var e={}.hasOwnProperty;function t(){for(var a=[],i=0;i<arguments.length;i++){var n=arguments[i];if(n){var r=typeof n;if("string"===r||"number"===r)a.push(n);else if(Array.isArray(n)&&n.length){var l=t.apply(null,n);l&&a.push(l)}else if("object"===r)for(var s in n)e.call(n,s)&&n[s]&&a.push(s)}}return a.join(" ")}n.exports?(t.default=t,n.exports=t):window.classNames=t}();var l=r.exports;function s(){const e=window["com.mendix.widgets.web.filterable.filterContext"];if(e)return{FilterContext:e};const a=t.createContext(void 0);return window["com.mendix.widgets.web.filterable.filterContext"]=a,{FilterContext:a}}function o(){const e=window["com.mendix.widgets.web.sortable.sortContext"];if(e)return{SortContext:e};const a=t.createContext(void 0);return window["com.mendix.widgets.web.sortable.sortContext"]=a,{SortContext:a}}function c(e){const[a,i]=t.useState(0),n=t.useRef(null),r=t.useCallback((t=>{Math.floor(t.target.scrollHeight-t.target.scrollTop)===Math.floor(t.target.clientHeight)&&e.hasMoreItems&&e.setPage&&e.setPage((e=>e+1))}),[e.hasMoreItems,e.setPage]),s=t.useCallback((()=>{e.isInfinite&&e.hasMoreItems&&a<=0&&n.current&&i(n.current.clientHeight-30)}),[e.isInfinite,e.hasMoreItems,a]);return t.useLayoutEffect((()=>{setTimeout((()=>s()),100)}),[s]),t.createElement("div",Object.assign({ref:n},e,{className:l(e.className,e.isInfinite?"infinite-loading":""),onScroll:e.isInfinite?r:void 0,style:e.isInfinite&&a>0?Object.assign(Object.assign({},e.style),{maxHeight:a}):e.style}),e.children)}function u(e){var a,i,n,r,l,s,o;const c=void 0!==e.numberOfItems?Math.ceil(e.numberOfItems/e.pageSize):void 0,u=void 0!==c?c-1:0,g=void 0!==c,m=e.page*e.pageSize+1,p=e.canNextPage||!e.numberOfItems?(e.page+1)*e.pageSize:e.numberOfItems,f=t=>{e.setPaginationIndex&&e.setPaginationIndex(t)};if(0===e.numberOfItems)return null;const b="".concat(m," to ").concat(p," ").concat(g?"of ".concat(null!==(a=e.numberOfItems)&&void 0!==a?a:(null!=c?c:1)*e.pageSize):"");return t.createElement("div",{"aria-label":null!==(i=e.labelPagination)&&void 0!==i?i:"Pagination",className:"pagination-bar",role:"pagination"},t.createElement("button",Object.assign({className:"btn pagination-button",disabled:0===e.page},d((()=>{e.gotoPage(0),f(0)})),{"aria-label":null!==(n=e.labelFirstPage)&&void 0!==n?n:"Go to first page"}),t.createElement("span",{"aria-hidden":!0,className:"glyphicon glyphicon-step-backward"})),t.createElement("button",Object.assign({className:"btn pagination-button",disabled:!e.canPreviousPage},d((()=>{e.previousPage(),f(e.page-1)})),{"aria-label":null!==(r=e.labelPreviousPage)&&void 0!==r?r:"Go to previous page"}),t.createElement("span",{"aria-hidden":!0,className:"glyphicon glyphicon-backward"})),t.createElement("span",{className:"sr-only sr-only-focusable"},null!==(l=e.labelPagingStatus)&&void 0!==l?l:"Currently showing"," ",b),t.createElement("div",{"aria-hidden":!0,className:"paging-status"},b),t.createElement("button",Object.assign({"aria-label":null!==(s=e.labelNextPage)&&void 0!==s?s:"Go to next page",className:"btn pagination-button",disabled:!e.canNextPage},d((()=>{e.nextPage(),f(e.page+1)}))),t.createElement("span",{"aria-hidden":!0,className:"glyphicon glyphicon-forward"})),g&&t.createElement("button",Object.assign({"aria-label":null!==(o=e.labelLastPage)&&void 0!==o?o:"Go to last page",className:"btn pagination-button",disabled:e.page===u},d((()=>{e.gotoPage(u),f(u)}))),t.createElement("span",{"aria-hidden":!0,className:"glyphicon glyphicon-step-forward"})))}function d(e){return{onClick:e,onKeyDown:t=>{" "!==t.key&&"Enter"!==t.key||(t.preventDefault(),t.stopPropagation(),e())}}}function g(e){const a=e.paging?t.createElement("div",{className:"widget-gallery-pagination"},t.createElement(u,{canNextPage:e.hasMoreItems,canPreviousPage:0!==e.page,gotoPage:t=>e.setPage&&e.setPage((()=>t)),nextPage:()=>e.setPage&&e.setPage((e=>e+1)),numberOfItems:e.numberOfItems,page:e.page,pageSize:e.pageSize,previousPage:()=>e.setPage&&e.setPage((e=>e-1))})):null;return t.createElement("div",{className:l("widget-gallery",e.className),"data-focusindex":e.tabIndex||0},"above"===e.paginationPosition&&a,t.createElement("div",{className:"widget-gallery-filter",role:"section","aria-label":e.filtersTitle},e.filters),e.items.length>0&&e.itemRenderer&&t.createElement(c,{className:l("widget-gallery-items","widget-gallery-lg-".concat(e.desktopItems),"widget-gallery-md-".concat(e.tabletItems),"widget-gallery-sm-".concat(e.phoneItems)),hasMoreItems:e.hasMoreItems,setPage:e.setPage,isInfinite:!e.paging,role:"list"},e.items.map((a=>e.itemRenderer(((e,i,n)=>t.createElement("div",{key:"item_".concat(a),className:l("widget-gallery-item",i,{"widget-gallery-clickable":!!n}),onClick:n,onKeyDown:n?e=>{"Enter"!==e.key&&" "!==e.key||(e.preventDefault(),n())}:void 0,role:n?"button":"listitem",tabIndex:n?0:void 0},e)),a)))),(0===e.items.length||e.preview)&&e.emptyPlaceholderRenderer&&e.emptyPlaceholderRenderer((a=>t.createElement("div",{className:"widget-gallery-empty",role:"section","aria-label":e.emptyMessageTitle},t.createElement("div",{className:"empty-placeholder"},a)))),"below"===e.paginationPosition&&a)}function m(e,t){if(!e||!t)return[];const a=p(t);return a?a.filter((e=>!!e.arg1&&!!e.arg2)).filter((t=>"attribute"===t.arg1.type&&t.arg1.attributeId===e.id)).map((e=>({type:String(e.name),value:e.arg2.value}))):[]}function p(e){return!e||"function"!==e.type||"and"!==e.name&&"or"!==e.name?e?[e]:void 0:e.args.flatMap(p).filter((e=>void 0!==e))}e.Gallery=function(e){var a,n,r,l;const c=t.useRef(void 0),u=t.useRef(void 0),[d,p]=t.useState(!1),[f,b]=t.useState(!1),v={string:t.useState(),number:t.useState(),date:t.useState(),enum:t.useState()},[h,y]=t.useState(),{FilterContext:P}=s(),{SortContext:I}=o(),w="virtualScrolling"===e.pagination,x=w?e.datasource.limit/e.pageSize:e.datasource.offset/e.pageSize;t.useEffect((()=>{e.datasource.requestTotalCount(!0),e.datasource.limit===Number.POSITIVE_INFINITY&&e.datasource.setLimit(e.pageSize)}),[e.datasource,e.pageSize]),t.useEffect((()=>{!e.datasource.filter||d||c.current||(c.current=e.datasource.filter),!e.datasource.sortOrder||f||u.current||(u.current=e.datasource.sortOrder)}),[e.datasource,d,f]);const S=t.useMemo((()=>e.filterList.reduce(((e,{filter:t})=>({...e,[t.id]:t})),{})),[e.filterList]),E=t.useMemo((()=>e.sortList.map((({attribute:e,caption:t})=>{var a;return{attribute:e,caption:null!==(a=t.value)&&void 0!==a?a:""}}))),[e.sortList]),C=t.useMemo((()=>e.filterList.reduce(((e,{filter:t})=>({...e,[t.id]:m(t,c.current)})),{})),[e.filterList,c.current]),N=Object.keys(v).map((e=>{var t;return null===(t=v[e][0])||void 0===t?void 0:t.getFilterCondition()})).filter((e=>void 0!==e));if(N.length>0?e.datasource.setFilter(N.length>1?i.and(...N):N[0]):d?e.datasource.setFilter(void 0):e.datasource.setFilter(c.current),h&&"getSortCondition"in h){const t=h.getSortCondition();e.datasource.setSortOrder(t?[t]:void 0)}else e.datasource.setSortOrder(void 0);const O=e.filterList.length>0||e.sortList.length>0,k=t.useCallback((t=>{const a=t(x);w?e.datasource.setLimit(a*e.pageSize):e.datasource.setOffset(a*e.pageSize)}),[e.datasource,e.pageSize,w,x]);return t.createElement(g,{className:e.class,desktopItems:e.desktopItems,emptyPlaceholderRenderer:t.useCallback((a=>"custom"===e.showEmptyPlaceholder?a(e.emptyPlaceholder):t.createElement("div",null)),[e.emptyPlaceholder,e.showEmptyPlaceholder]),emptyMessageTitle:null===(a=e.emptyMessageTitle)||void 0===a?void 0:a.value,filters:t.useMemo((()=>O?t.createElement(P.Provider,{value:{filterDispatcher:e=>{if(e.filterType){const[,t]=v[e.filterType];t(e),p(!0)}return e},multipleAttributes:S,multipleInitialFilters:C}},t.createElement(I.Provider,{value:{sortDispatcher:e=>(b(!0),y(e),e),attributes:E,initialSort:u.current}},e.filtersPlaceholder)):null),[P,I,v,S,C,O,e.filtersPlaceholder,E]),filtersTitle:null===(n=e.filterSectionTitle)||void 0===n?void 0:n.value,hasMoreItems:null!==(r=e.datasource.hasMoreItems)&&void 0!==r&&r,items:null!==(l=e.datasource.items)&&void 0!==l?l:[],itemRenderer:t.useCallback(((t,a)=>{var i,n,r,l;return t(null===(i=e.content)||void 0===i?void 0:i.get(a),null===(r=null===(n=e.itemClass)||void 0===n?void 0:n.get(a))||void 0===r?void 0:r.value,e.onClick?null===(l=e.onClick)||void 0===l?void 0:l.get(a).execute:void 0)}),[e.content,e.itemClass,e.onClick]),numberOfItems:e.datasource.totalCount,page:x,pageSize:e.pageSize,paging:"buttons"===e.pagination,paginationPosition:e.pagingPosition,phoneItems:e.phoneItems,setPage:k,tabletItems:e.tabletItems,tabIndex:e.tabIndex})},Object.defineProperty(e,"__esModule",{value:!0})}));
