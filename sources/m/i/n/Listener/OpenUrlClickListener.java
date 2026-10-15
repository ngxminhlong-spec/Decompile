package m.i.n.Listener;

import android.content.Context;
import android.content.DialogInterface;
import m.i.n.i;

/* loaded from: classes2.dex */
public class OpenUrlClickListener implements DialogInterface.OnClickListener {
    private final Context context;
    private final String url;

    public OpenUrlClickListener(Context context, String str) {
        this.context = context;
        this.url = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i4) {
        i.updateOpen(this.context, this.url);
    }
}
