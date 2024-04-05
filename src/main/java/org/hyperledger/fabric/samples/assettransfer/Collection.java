package org.hyperledger.fabric.samples.assettransfer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 藏品信息表
 *
 * @TableName collection
 */
@Data
@AllArgsConstructor
public class Collection implements Serializable {
    /**
     *
     */
    private final Integer id;

    /**
     * 藏品名称
     */
    private final String name;

    /**
     * 图片链接
     */
    private final String imageUrl;

    /**
     * 藏品介绍
     */
    private final String description;

    /**
     * 价格
     */
    private final BigDecimal price;

    /**
     * 份数
     */
    private final Integer quantity;

    /**
     * 分类
     */
    private final String category;

    /**
     * 制作者
     */
    private final Integer creator;

    /**
     * 拥有者
     */
    private final Integer owner;

    /**
     * 区块链地址
     */
    private final String blockchainAddress;

    /**
     * 创建时间
     */
    private final LocalDateTime createdAt;

    /**
     * 修改时间
     */
    private LocalDateTime updatedAt;

    /**
     * 是否上链
     */
    private Boolean isOnChain;

    /**
     *
     */
    private LocalDateTime onChainTime;

    /**
     * 喜欢数
     */
    private Integer likeNum;

    /**
     * 热度
     */
    private Integer hotValue;

    /**
     *
     */
    private Integer commentsNum;

    /**
     * 0代表官方 1代表原创 2代表AI
     */
    private Integer type;

    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Collection other = (Collection) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
                && (this.getImageUrl() == null ? other.getImageUrl() == null : this.getImageUrl().equals(other.getImageUrl()))
                && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
                && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
                && (this.getQuantity() == null ? other.getQuantity() == null : this.getQuantity().equals(other.getQuantity()))
                && (this.getCategory() == null ? other.getCategory() == null : this.getCategory().equals(other.getCategory()))
                && (this.getCreator() == null ? other.getCreator() == null : this.getCreator().equals(other.getCreator()))
                && (this.getOwner() == null ? other.getOwner() == null : this.getOwner().equals(other.getOwner()))
                && (this.getBlockchainAddress() == null ? other.getBlockchainAddress() == null : this.getBlockchainAddress().equals(other.getBlockchainAddress()))
                && (this.getCreatedAt() == null ? other.getCreatedAt() == null : this.getCreatedAt().equals(other.getCreatedAt()))
                && (this.getUpdatedAt() == null ? other.getUpdatedAt() == null : this.getUpdatedAt().equals(other.getUpdatedAt()))
                && (this.getIsOnChain() == null ? other.getIsOnChain() == null : this.getIsOnChain().equals(other.getIsOnChain()))
                && (this.getOnChainTime() == null ? other.getOnChainTime() == null : this.getOnChainTime().equals(other.getOnChainTime()))
                && (this.getLikeNum() == null ? other.getLikeNum() == null : this.getLikeNum().equals(other.getLikeNum()))
                && (this.getHotValue() == null ? other.getHotValue() == null : this.getHotValue().equals(other.getHotValue()))
                && (this.getCommentsNum() == null ? other.getCommentsNum() == null : this.getCommentsNum().equals(other.getCommentsNum()))
                && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getImageUrl() == null) ? 0 : getImageUrl().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getQuantity() == null) ? 0 : getQuantity().hashCode());
        result = prime * result + ((getCategory() == null) ? 0 : getCategory().hashCode());
        result = prime * result + ((getCreator() == null) ? 0 : getCreator().hashCode());
        result = prime * result + ((getOwner() == null) ? 0 : getOwner().hashCode());
        result = prime * result + ((getBlockchainAddress() == null) ? 0 : getBlockchainAddress().hashCode());
        result = prime * result + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        result = prime * result + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        result = prime * result + ((getIsOnChain() == null) ? 0 : getIsOnChain().hashCode());
        result = prime * result + ((getOnChainTime() == null) ? 0 : getOnChainTime().hashCode());
        result = prime * result + ((getLikeNum() == null) ? 0 : getLikeNum().hashCode());
        result = prime * result + ((getHotValue() == null) ? 0 : getHotValue().hashCode());
        result = prime * result + ((getCommentsNum() == null) ? 0 : getCommentsNum().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", imageUrl=").append(imageUrl);
        sb.append(", description=").append(description);
        sb.append(", price=").append(price);
        sb.append(", quantity=").append(quantity);
        sb.append(", category=").append(category);
        sb.append(", creator=").append(creator);
        sb.append(", owner=").append(owner);
        sb.append(", blockchainAddress=").append(blockchainAddress);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", isOnChain=").append(isOnChain);
        sb.append(", onChainTime=").append(onChainTime);
        sb.append(", likeNum=").append(likeNum);
        sb.append(", hotValue=").append(hotValue);
        sb.append(", commentsNum=").append(commentsNum);
        sb.append(", type=").append(type);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}