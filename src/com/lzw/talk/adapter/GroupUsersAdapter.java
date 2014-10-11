package com.lzw.talk.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.lzw.talk.R;
import com.lzw.talk.avobject.User;
import com.lzw.talk.util.ChatUtils;

import java.util.List;

/**
 * Created by lzw on 14-10-11.
 */
public class GroupUsersAdapter extends BaseListAdapter<User> {
  public GroupUsersAdapter(Context ctx, List<User> datas) {
    super(ctx, datas);
  }

  @Override
  public View getView(int position, View conView, ViewGroup parent) {
    if (conView == null) {
      conView = View.inflate(ctx, R.layout.group_user_item, null);
    }
    User user = datas.get(position);
    ChatUtils.setUserView(conView, user);
    return conView;
  }
}
