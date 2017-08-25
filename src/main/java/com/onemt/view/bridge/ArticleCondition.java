package com.onemt.view.bridge;

import java.util.*;

/**
 * description
 *
 * @author Administrator
 * @date 2017/8/23
 */
public class ArticleCondition {

    private int fetchTime;
    private int endFetchTime;

    private int publishTime;
    private int endPublishTime;

    private String sourceUrlPart;

    private Set<Integer> mediaSet;
    private Set<Integer> categorySet;
    private Set<Long> articleSet;

    private String orderBy;

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public int getFetchTime() {
        return fetchTime;
    }

    public void setFetchTime(int fetchTime) {
        this.fetchTime = fetchTime;
    }

    public int getEndFetchTime() {
        return endFetchTime;
    }

    public void setEndFetchTime(int endFetchTime) {
        this.endFetchTime = endFetchTime;
    }

    public int getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(int publishTime) {
        this.publishTime = publishTime;
    }

    public int getEndPublishTime() {
        return endPublishTime;
    }

    public void setEndPublishTime(int endPublishTime) {
        this.endPublishTime = endPublishTime;
    }

    public String getSourceUrlPart() {
        return sourceUrlPart;
    }

    public void setSourceUrlPart(String sourceUrlPart) {
        this.sourceUrlPart = sourceUrlPart;
    }

    public Set<Integer> getMediaSet() {
        return mediaSet;
    }

    public void setMediaSet(Set<Integer> mediaSet) {
        this.mediaSet = mediaSet;
    }

    public Set<Integer> getCategorySet() {
        return categorySet;
    }

    public void setCategorySet(Set<Integer> categorySet) {
        this.categorySet = categorySet;
    }

    public Set<Long> getArticleSet() {
        return articleSet;
    }

    public void setArticleSet(Set<Long> articleSet) {
        this.articleSet = articleSet;
    }

    private void initMedia() {
        if(null == mediaSet) {
            mediaSet = new TreeSet<Integer>();
        }
    }

    private void initCategory() {
        if(null == categorySet) {
            categorySet = new TreeSet<Integer>();
        }
    }

    private void initArticle() {
        if(null == articleSet) {
            articleSet = new TreeSet<Long>();
        }
    }

    public void addMedia(int id) {
        initMedia();
        mediaSet.add(id);
    }

    public void addCategory(int id) {
        initCategory();
        categorySet.add(id);
    }

    public void addAritcle(Long id) {
        initArticle();
        articleSet.add(id);
    }

    public List<Integer> getMediaList() {
        if(mediaSet != null) {
            return Arrays.asList(mediaSet.toArray(new Integer[mediaSet.size()]));
        }
        return null;
    }

    public List<Integer> getCategoryList() {
        if(categorySet != null) {
            return Arrays.asList(categorySet.toArray(new Integer[categorySet.size()]));
        }
        return null;
    }

    public List<Long> getArticleList() {
        if(articleSet != null) {
            return Arrays.asList(articleSet.toArray(new Long[articleSet.size()]));
        }
        return null;
    }
/*

    public String getFetchTimeBridge() {
        if(endFetchTime > 0) {
            return String.format("fetchTime between %d and %d",fetchTime,endFetchTime);
        } else {
            if(fetchTime > 0) {
                return "fetchTime > " + fetchTime;
            } else {
                return null;
            }
        }
    }
*/

/*

    private <T> void fixIteratorBridgeBuilder(StringBuilder builder,Iterator<T> iterator,String split,String open,String closeOpen) {
        builder.append(open);
        builder.append(iterator.next());
        while (iterator.hasNext()) {
            builder.append(split).append(iterator.next());
        }
        builder.append(closeOpen);
    }
*/

/*

    public String getMediaBridge() {
        if(mediaSet != null) {
            StringBuilder sb = new StringBuilder("mediaId");
            Iterator<Integer> iterator = mediaSet.iterator();
            if (mediaSet.size() == 1) {
                sb.append(" = ").append(iterator.next());
                return sb.toString();
            } else if(mediaSet.size() > 1){
                sb.append(" in ");
                fixIteratorBridgeBuilder(sb,iterator,",","(",")");
                return sb.toString();
            }
        }

        //预判之外的情况统一返回null
        return null;
    }

*/


}
