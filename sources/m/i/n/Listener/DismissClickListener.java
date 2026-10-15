package m.i.n.Listener;

import android.content.DialogInterface;

/* loaded from: classes2.dex */
public class DismissClickListener implements DialogInterface.OnClickListener {
    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i4) {
        dialogInterface.dismiss();
    }
}
