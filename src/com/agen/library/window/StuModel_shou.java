package com.agen.library.window;

	import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

import javax.swing.table.AbstractTableModel;

	public class StuModel_shou extends AbstractTableModel {
		/**
		 * 
		 */
		private static final long serialVersionUID = -44952199646762484L;
		Connection ct = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Vector rowdata, columnName;

		public void init(String sql) {
			if (sql.equals("")) {
				sql = "select receivephone,receivename,"
			    		+ "receiveadress,id from receive";
			}
			columnName = new Vector();
			//columnName.add("ID");
			columnName.add("收件人电话");
			columnName.add("收件人姓名");
			columnName.add("收件人地址");
			columnName.add("曾用单号");
			rowdata = new Vector( );
			try {
				// 加载驱动
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				ct = DriverManager.getConnection(
						"jdbc:sqlserver://localhost:1433;DatabaseName=_library",
						"sa", "123456");
				ps = ct.prepareStatement(sql);
				rs = ps.executeQuery();

				while (rs.next()) {
					Vector v = new Vector();
					//v.add(rs.getInt(1));

					v.add(rs.getString(1));
					v.add(rs.getString(2));
					v.add(rs.getString(3));
					v.add(rs.getString(4));
					rowdata.add(v);
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				// 关闭
				try {
					if (rs != null)
						rs.close();
					if (ps != null)
						ps.close();
					if (ct != null)
						ct.close();
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
			}
		}

		// 初始化数据模型
		public StuModel_shou() {
			this.init("");
		}

		// 通过传递的SQL语句来获得数据模型
		public StuModel_shou(String sql) {
			this.init(sql);
		}

		
		// 得到共有多少行
		public int getRowCount() {
			// TODO 自动生成的方法存根
			return this.rowdata.size();
		}

		// 得到共有多少列
		public int getColumnCount() {
			// TODO 自动生成的方法存根
			return this.columnName.size();
		}

		// 得到某行某列的数据
		public Object getValueAt(int rowIndex, int columnIndex) {
			// TODO 自动生成的方法存根
			return ((Vector) this.rowdata.get(rowIndex)).get(columnIndex);
		}

		/*
		 * （非 Javadoc）
		 * 
		 * @see javax.swing.table.AbstractTableModel#getColumnName(int)
		 */
		@Override
		public String getColumnName(int column) {
			// TODO 自动生成的方法存根
			return (String) this.columnName.get(column);
		}
}
