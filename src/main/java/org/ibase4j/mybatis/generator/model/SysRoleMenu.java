package org.ibase4j.mybatis.generator.model;

import java.io.Serializable;
import java.util.Date;

public class SysRoleMenu implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role_menu.id_
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role_menu.role_id
     *
     * @mbggenerated
     */
    private Integer roleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role_menu.menu_id
     *
     * @mbggenerated
     */
    private Integer menuId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role_menu.authorize_
     *
     * @mbggenerated
     */
    private Integer authorize;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role_menu.operate_time
     *
     * @mbggenerated
     */
    private Date operateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role_menu.operator_id
     *
     * @mbggenerated
     */
    private Integer operatorId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_role_menu
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role_menu.id_
     *
     * @return the value of sys_role_menu.id_
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role_menu.id_
     *
     * @param id the value for sys_role_menu.id_
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role_menu.role_id
     *
     * @return the value of sys_role_menu.role_id
     *
     * @mbggenerated
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role_menu.role_id
     *
     * @param roleId the value for sys_role_menu.role_id
     *
     * @mbggenerated
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role_menu.menu_id
     *
     * @return the value of sys_role_menu.menu_id
     *
     * @mbggenerated
     */
    public Integer getMenuId() {
        return menuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role_menu.menu_id
     *
     * @param menuId the value for sys_role_menu.menu_id
     *
     * @mbggenerated
     */
    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role_menu.authorize_
     *
     * @return the value of sys_role_menu.authorize_
     *
     * @mbggenerated
     */
    public Integer getAuthorize() {
        return authorize;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role_menu.authorize_
     *
     * @param authorize the value for sys_role_menu.authorize_
     *
     * @mbggenerated
     */
    public void setAuthorize(Integer authorize) {
        this.authorize = authorize;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role_menu.operate_time
     *
     * @return the value of sys_role_menu.operate_time
     *
     * @mbggenerated
     */
    public Date getOperateTime() {
        return operateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role_menu.operate_time
     *
     * @param operateTime the value for sys_role_menu.operate_time
     *
     * @mbggenerated
     */
    public void setOperateTime(Date operateTime) {
        this.operateTime = operateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role_menu.operator_id
     *
     * @return the value of sys_role_menu.operator_id
     *
     * @mbggenerated
     */
    public Integer getOperatorId() {
        return operatorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role_menu.operator_id
     *
     * @param operatorId the value for sys_role_menu.operator_id
     *
     * @mbggenerated
     */
    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
    }
}